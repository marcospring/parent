package com.csyy.generate.bin;

import java.util.ArrayList;
import java.util.List;

import com.csyy.common.PropertiesUtils;
import com.csyy.generate.utils.GenerateUtils;

/**
 * Created by zhangkui on 16/4/28.
 */
public class Generate {

    public static void main(String[] args) throws Exception {

        PropertiesUtils p = new PropertiesUtils();
        List<String> configFilePath = new ArrayList<String>();
        configFilePath.add("/properties/jdbc.properties");
        p.setUrls(configFilePath);

        String systemName = p.get("generate.systemName");
        String projectName = p.get("generate.projectName");
        String companyName = p.get("generate.companyName");

        String generateAll = p.get("generate.all");
        List<String> list = new ArrayList<String>();
        if ("1".endsWith(generateAll)) {
            // 全库生成
            list = GenerateUtils.getTable();
        } else {
            String tableNames = p.get("generate.tableNames");
            // 部分生成
            String[] tables = tableNames.split(",");
            for (String table : tables) {
                list.add(table);
            }
        }
        try {
            for (String tableName : list) {
                GenerateConfig config = new GenerateConfig(tableName,
                        systemName, projectName, companyName);
                FileBuilder builder = new FileBuilder(config);
                builder.createMapper();
                builder.createPo();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
