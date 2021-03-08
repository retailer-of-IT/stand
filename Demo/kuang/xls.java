/*
 * package Demo.kuang;
 * 
 * import java.io.FileOutputStream; import java.io.IOException;
 * 
 * public class xls { private static final String StringUtils = null;
 * 
 * private static void createExcel(String filePath) throws IOException {
 * FileOutputStream out = null; Workbook wb = null; if
 * (StringUtils.substring(filePath, ".").equals("xls")) { wb = new Workbook(); }
 * if (StringUtils.substring(filePath, ".").equals("xlsx")) { wb = new
 * Workbook(); } if (wb == null) {
 * System.out.println("文件后缀不规范，无法操作excel文件，后缀示例：" + "xls" + ", " + "xlsx");
 * return; } out = new FileOutputStream(filePath); wb.createSheet();
 * wb.setSheetName(0, "Sheet1"); ((Workbook) wb).write(out); out.close(); if
 * (out != null) { out.flush(); out.close(); } } }
 */