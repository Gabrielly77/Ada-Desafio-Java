public class Solution {
    public static String[] substringStr(String[] input) {
        String[] resultadoTemp = new String[input.length];
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (i != j && input[j].contains(input[i])) {
                    
                    boolean jaAdicionado = false;
                    for (int k = 0; k < count; k++) {
                        if (resultadoTemp[k].equals(input[i])) {
                            jaAdicionado = true;
                            break;
                        }
                    }
                    if (!jaAdicionado) {
                        resultadoTemp[count++] = input[i];
                    }
                    break;
                }
            }
        }

       
        String[] resultadoFinal = new String[count];
        for (int i = 0; i < count; i++) {
            resultadoFinal[i] = resultadoTemp[i];
        }

        return resultadoFinal;
    }

    public static void main(String[] args) {
        String[] entrada1 = {"ana", "joao", "ana", "arvore"};
        String[] entrada2 = {"carro", "ca", "paz", "pá"};

        String[] resultado1 = substringStr(entrada1);
        String[] resultado2 = substringStr(entrada2);

        for (String palavra : resultado1) {
            System.out.print(palavra + " ");
        }
        System.out.println();

        for (String palavra : resultado2) {
            System.out.print(palavra + " ");
        }
        System.out.println();
    }
}
