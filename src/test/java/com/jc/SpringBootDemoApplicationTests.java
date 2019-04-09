package com.jc;

import com.jc.springBootDemo.SpringBootDemoApplication;
import org.apache.poi.xwpf.usermodel.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class SpringBootDemoApplicationTests {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringBootDemoApplicationTests.class);
    @Test
    public void contextLoads() {
        System.out.println("test");
        LOGGER.info("test1");
    }
    @Test
    public void test1() throws Exception {
        FileInputStream stream = new FileInputStream("C:\\Users\\JcL\\Desktop\\demo.docx");
        XWPFDocument doc = new XWPFDocument(stream);// 创建Word文件
        for (XWPFParagraph p : doc.getParagraphs())//遍历段落
        {
            System.out.print(p.getParagraphText());
        }
        for (XWPFTable table : doc.getTables())//遍历表格
        {
            for (XWPFTableRow row : table.getRows()) {
                for (XWPFTableCell cell : row.getTableCells()) {
                    System.out.print(cell.getText());
                }
            }

        }
    }
}
