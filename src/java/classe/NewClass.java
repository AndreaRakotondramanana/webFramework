/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author itu
 */
public class NewClass {
        public static String[] getUrl(String Url){
        if (Url==null) {
            String[] url={"/"};
            return url;
        }
        return Url.split("/");
    }
}
