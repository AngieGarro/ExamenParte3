package encripta;

public class EncriptadoVignere implements ENCRIPTA{
    String Letras = "abcdefghijklmnopqrstuvwxyz";
    //ABCDEFGHIJKLMNOPQRSUVWXYZ
    String clave = "saoko";

    //Estructura de los métodos
    @Override
    public void encripta(String texto){
        String encripta = " ";
        String snor = texto.toLowerCase();
        for(int i = 0, c = 0;i<texto.length(); i++, c = (c+1) % clave.length()){
            if(Letras.indexOf(snor.charAt(i))!=-1){
                int tmp = (Letras.indexOf(snor.charAt(i)) + Letras.indexOf(clave.charAt(c))) % Letras.length();
                encripta += (Letras.indexOf(texto.charAt(i))!=-1)?Letras.charAt(tmp):String.valueOf(Letras.charAt(tmp)).toUpperCase();
            }
            else {
                c-= 1;
                encripta += texto.charAt(i);
            }
        }
        System.out.println(encripta);
    }

    @Override
    public void desencripta(String texto) {
        String desencripta = " ";
        String snor = texto.toLowerCase();
        for(int i = 0,c = 0;i<snor.length(); i++,c = (c+1) % clave.length()){
            if(Letras.indexOf(snor.charAt(i))!=-1){
                int tmp = (Letras.indexOf(snor.charAt(i))-Letras.indexOf(clave.charAt(c)));
                tmp = (tmp<0)?(tmp+Letras.length()):tmp;
                desencripta+= (Letras.indexOf(texto.charAt(i))!=-1)?Letras.charAt(tmp):String.valueOf(Letras.charAt(tmp)).toUpperCase();
            }
            else {
                c-=1;
                desencripta += texto.charAt(i);
            }
        }
        System.out.println(desencripta);
    }
}
