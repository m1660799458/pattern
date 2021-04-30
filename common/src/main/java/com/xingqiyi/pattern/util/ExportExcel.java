package com.xingqiyi.pattern.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * todo
 *
 * @author xingqiyi
 * @date 2021年04月30日 上午11:29
 */
@Slf4j
@Component
public class ExportExcel {
    public void doExportExcel() {

        SXSSFWorkbook wb = new SXSSFWorkbook(100);
        Sheet sheet = wb.createSheet("用户001");
        AtomicInteger row = new AtomicInteger();
        Row rowTitle = sheet.createRow(row.get());
        //创建单元格并设置单元格内容
        rowTitle.createCell(0).setCellValue("用户loginName");
        rowTitle.createCell(1).setCellValue("入口");
        rowTitle.createCell(2).setCellValue("请求地址");
        rowTitle.createCell(3).setCellValue("一级模块名称");
        rowTitle.createCell(4).setCellValue("二级模块名称");
        rowTitle.createCell(5).setCellValue("当前操作");
        rowTitle.createCell(6).setCellValue("关键业务参数");
        rowTitle.createCell(7).setCellValue("浏览器信息");


        // 定义一个Excel的行对象
        Row rowContent;
        for (int i = 0; i < 600000; i++) {
            rowContent = sheet.createRow(row.incrementAndGet());
            rowContent.createCell(0).setCellValue(i);
            rowContent.createCell(1).setCellValue(i + "::::123123123123");
            rowContent.createCell(2).setCellValue(i + "::::浏览器信息");
            rowContent.createCell(3).setCellValue(i + "::::浏览器信息");
            rowContent.createCell(4).setCellValue(i + "::::123123123123");
            rowContent.createCell(5).setCellValue(i + "::::关键业务参数");
            rowContent.createCell(6).setCellValue(i + "::::123123123123");
            rowContent.createCell(7).setCellValue(i + "::::二级模块名称");
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream("./log.xlsx");) {
            wb.write(fileOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
