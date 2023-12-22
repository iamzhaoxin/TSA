/**
 * @Author: 赵鑫
 * @Date: 2023/12/19 20:46
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Analysis {

    public static void main(String[] args) {
        // 请确保传递了目标文件夹路径和两个文件名作为参数
        if (args.length != 3) {
            System.out.println("请提供目标文件夹路径和两个文件名作为参数");
            return;
        }

        String folderPath = args[0];
        String file1Name = args[1];
        String file2Name = args[2];

        try {
            String filePath1 = folderPath + File.separator + file1Name;
            String filePath2 = folderPath + File.separator + file2Name;

            String content1 = readFileContent(filePath1);
            String content2 = readFileContent(filePath2);





            // 结合两个文件的内容生成数据
            String combinedData = content1 + content2;

            // 输出生成的数据
            System.out.println("生成的数据:");
            System.out.println(combinedData);




        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFileContent(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        return content.toString();
    }
}

