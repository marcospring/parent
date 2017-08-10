package com.csyy.file.text.pdf;

import com.csyy.file.text.pdf.factory.ITextRendererObjectFactory;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.xhtmlrenderer.pdf.ITextRenderer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 生成pdf
 * Created by zhangbin on 16/6/1.
 */
public class PdfGenerator {
    private final static Logger logger = Logger.getLogger(PdfGenerator.class);

    /**
     * Output a pdf to the specified outputstream
     *
     * @param htmlContent
     *            the htmlstr
     * @param outputFile
     *            the specified outputpath
     * @throws Exception
     */
    public static void generate(String htmlContent, String outputFile)
            throws Exception {
        OutputStream out = null;
        ITextRenderer iTextRenderer = null;

        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(htmlContent
                    .getBytes("UTF-8")));
            File f = new File(outputFile);
            if (f != null && !f.getParentFile().exists()) {
                f.getParentFile().mkdirs();
            }
            out = new FileOutputStream(outputFile);

            iTextRenderer = (ITextRenderer) ITextRendererObjectFactory
                    .getObjectPool().borrowObject();//获取对象池中对象

            try {
                iTextRenderer.setDocument(doc, null);
                iTextRenderer.layout();
                iTextRenderer.createPDF(out);
            } catch (Exception e) {
                ITextRendererObjectFactory.getObjectPool().invalidateObject(
                        iTextRenderer);
                iTextRenderer = null;
                throw e;
            }

        } catch (Exception e) {
            throw e;
        } finally {
            if (out != null)
                out.close();

            if (iTextRenderer != null) {
                try {
                    ITextRendererObjectFactory.getObjectPool().returnObject(
                            iTextRenderer);
                } catch (Exception ex) {
                    logger.error("Cannot return object from pool.", ex);
                }
            }
        }
    }

}
