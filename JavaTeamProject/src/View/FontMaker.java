package View;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class FontMaker {

   public void FontChange(GraphicsEnvironment ge) {

     Font bmin1;
     Font bmin2;
     Font bmin3;
	   
	   String path = "C:\\Users\\SMHRD\\AppData\\Local\\Microsoft\\Windows\\Fonts\\BMJUA_ttf.ttf"; // ��Ʈ�� ��θ� �������°�
	   String path1 = "C:\\Users\\SMHRD\\AppData\\Local\\Microsoft\\Windows\\Fonts\\���ü.ttf"; // ��Ʈ�� ��θ� �������°�
	   String path2 = "C:\\Users\\SMHRD\\AppData\\Local\\Microsoft\\Windows\\Fonts\\BMHANNAAir_ttf.ttf"; // ��Ʈ�� ��θ� �������°�
      
	   
	   // font�� ���Ӱ� ������ �Ұǵ�, �Ű������� ���� �� (�Ÿ������ ��Ʈ�� ���� ����, ����)

      try {
         bmin1 = Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(12f);
         bmin2 = Font.createFont(Font.TRUETYPE_FONT, new File(path1)).deriveFont(12f);
         bmin3 = Font.createFont(Font.TRUETYPE_FONT, new File(path2)).deriveFont(12f);
         
         ge.registerFont(bmin1);
         ge.registerFont(bmin2);
         ge.registerFont(bmin3);
    
      } catch (FontFormatException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      } catch (IOException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }
//      String[] fonts = ge.getAvailableFontFamilyNames();
//      for (int i = 0; i < fonts.length; i++) {
//         System.out.println(fonts[i]);
      
      
   }
}
//}