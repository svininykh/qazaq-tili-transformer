/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobi.nordpos.qazaqtili;

/**
 *
 * @author svininykh-av
 */
public class CyrToLatConverter {

    String text = "";

    public CyrToLatConverter(String text) {

        for (int i = 0; i < text.length(); i++) {
            this.text = this.text.concat(convertCyrChar(text.charAt(i)));
        }
    }

    private String convertCyrChar(char c) {
        if ((c >= 0x0020) && (c < 0x0080)) {
            return Character.toString(c);
        } else {
            switch (c) {
                default:
                    return "?"; // ? Not valid character.

                case '\u0410':
                    return "A";// A
                case '\u0411':
                    return "B";// Б
                case '\u0412':
                    return "V";// В
                case '\u0413':
                    return "G";// Г
                case '\u0414':
                    return "D";// Д
                case '\u0415':
                    return "E";// Е
                case '\u0416':
                    return "J";// Ж
                case '\u0417':
                    return "Z";// З
                case '\u0418':
                case '\u0419':
                    return "I";// И Й
                case '\u041A':
                    return "K";// К
                case '\u041B':
                    return "L";// Л
                case '\u041C':
                    return "M";// М
                case '\u041D':
                    return "N";// Н
                case '\u041E':
                    return "O";// О
                case '\u041F':
                    return "P";// П
                case '\u0420':
                    return "R";// Р
                case '\u0421':
                    return "S";// С
                case '\u0422':
                    return "T";// Т
                case '\u0423':
                    return "Ý";// У
                case '\u0424':
                    return "F";// Ф
                case '\u0425':
                    return "H";// Х
                case '\u0427':
                    return "Ch";// Ч
                case '\u0428':
                    return "Sh";// Ш
                case '\u042B':
                    return "Y";// Ы
                case '\u0430':
                    return "a";// a
                case '\u0431':
                    return "b";// б
                case '\u0432':
                    return "v";// в
                case '\u0433':
                    return "g";// г
                case '\u0434':
                    return "d";// д
                case '\u0435':
                    return "e";// е
                case '\u0436':
                    return "j";// ж
                case '\u0437':
                    return "z";// з
                case '\u0439':
                case '\u0438':
                    return "i";// и й
                case '\u043A':
                    return "k";// к
                case '\u043B':
                    return "l";// л
                case '\u043C':
                    return "m";// м
                case '\u043D':
                    return "n";// н
                case '\u043E':
                    return "o";// о
                case '\u043F':
                    return "p";// п
                case '\u0440':
                    return "r";// р
                case '\u0441':
                    return "s";// с
                case '\u0442':
                    return "t";// т
                case '\u0443':
                    return "ý";// у
                case '\u0444':
                    return "f";// ф
                case '\u0445':
                    return "h";// х
                case '\u0447':
                    return "ch";// ч
                case '\u0448':
                    return "sh";// ш
                case '\u044B':
                    return "y";// ы
                case '\u04B0':
                    return "U";// Ұ
                case '\u04B1':
                    return "u";// ұ
                case '\u0492':
                    return "Ǵ";// Ғ
                case '\u0493':
                    return "ǵ";// ғ
                case '\u04E8':
                    return "Ó";// Ө                            
                case '\u04E9':
                    return "ó";// ө 
                case '\u04A2':
                    return "Ń";// Ң
                case '\u04A3':
                    return "ń";// ң
                case '\u049A':
                    return "Q";// Қ
                case '\u049B':
                    return "q";// қ
                case '\u04BA':
                    return "H";// Һ
                case '\u04BB':
                    return "h";// һ
                case '\u04AE':
                    return "Ú";// Ү
                case '\u04AF':
                    return "ú";// ү
                case '\u0406':
                    return "I";// І
                case '\u0456':
                    return "i";// і
                case '\u04D8':
                    return "Á";// Ә
                case '\u04D9':
                    return "á";// ә
            }
        }
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
