public class Algorithm {

    public void algorithm (String CC){

      //variaveis para a soma e boleano que serve para intrecalar p/ o 2º n.
      int sum = 0;
      boolean secondDigit = false;

      //Tamanho do numero de CC
      int CCLength = CC.length();

      //Criar o array CC_int vazio com o tamanho do numero de CC
      int[] CC_int = new int[CCLength];

      //Verificar se o CC tem 12 dígitos
      if(CCLength!=12){
        System.out.println("O número de CC é inválido");       
      }else{

        for (int i = CCLength-1;i >= 0; --i) {
          
          char[] CChar = CC.toCharArray();

          switch (CChar[i]) {

            case '0' : CC_int[i] = 0;
            break;
            case '1' : CC_int[i] = 1;
            break;
            case '2' : CC_int[i] = 2;
            break;
            case '3' : CC_int[i] = 3;
            break;
            case '4' : CC_int[i] = 4;
            break;
            case '5' : CC_int[i] = 5;
            break;
            case '6' : CC_int[i] = 6;
            break;
            case '7' : CC_int[i] = 7;
            break;
            case '8' : CC_int[i] = 8;
            break;
            case '9' : CC_int[i] = 9;
            break;
            case 'A' : CC_int[i] = 10;
            break;
            case 'B' : CC_int[i] = 11;
            break;
            case 'C' : CC_int[i] = 12;
            break;
            case 'D' : CC_int[i] = 13;
            break;
            case 'E' : CC_int[i] = 14;
            break;
            case 'F' : CC_int[i] = 15;
            break;
            case 'G' : CC_int[i] = 16;
            break;
            case 'H' : CC_int[i] = 17;
            break;
            case 'I' : CC_int[i] = 18;
            break;
            case 'J' : CC_int[i] = 19;
            break;
            case 'K' : CC_int[i] = 20;
            break;
            case 'L' : CC_int[i] = 21;
            break;
            case 'M' : CC_int[i] = 22;
            break;
            case 'N' : CC_int[i] = 23;
            break;
            case 'O' : CC_int[i] = 24;
            break;
            case 'P' : CC_int[i] = 25;
            break;
            case 'Q' : CC_int[i] = 26;
            break;
            case 'R' : CC_int[i] = 27;
            break;
            case 'S' : CC_int[i] = 28;
            break;
            case 'T' : CC_int[i] = 29;
            break;
            case 'U' : CC_int[i] = 30;
            break;
            case 'V' : CC_int[i] = 31;
            break;
            case 'W' : CC_int[i] = 32;
            break;
            case 'X' : CC_int[i] = 33;
            break;
            case 'Y' : CC_int[i] = 34;
            break;
            case 'Z' : CC_int[i] = 35;
            break;}

        if (secondDigit) 
        { 
          CC_int[i] *= 2; 
         if (CC_int[i] > 9) 
         CC_int[i] -= 9; 
        } 
        sum += CC_int[i]; 
        secondDigit = !secondDigit;
        }

        if (sum%10 == 0) {
          System.out.println("O número de CC é Válido");   
        }
        else {
          System.out.println("O número de CC é Inválido");  
        }

      }
  
    }

  }
  
  