{"filter":false,"title":"Practice12.java","tooltip":"/java-lesson/practice/Practice12.java","undoManager":{"mark":5,"position":5,"stack":[[{"start":{"row":0,"column":0},"end":{"row":17,"column":1},"action":"insert","lines":["","public class Zen2Han {","  public static void main(String[] args) {","    String str = \"ａｂ漢字ｃＤディーefＧＨＩJｚＺ!$&\";","    System.out.println(\"変換前：\" + str);","    StringBuilder sb = new StringBuilder();","    for (int i = 0; i < str.length(); i++ ) {","      char c = str.charAt(i);","      if ( 'ａ' <= c && c <= 'ｚ') {","        c = (char)(c - 'ａ' + 'a' );","      } else if ( 'Ａ' <= c && c <= 'Ｚ') {","        c = (char)(c -  'Ａ' + 'A' );","      }","      sb.append(c);","    }","    System.out.println(\"変換後：\" + sb.toString());","  }","}"],"id":1}],[{"start":{"row":17,"column":1},"end":{"row":18,"column":0},"action":"insert","lines":["",""],"id":2}],[{"start":{"row":0,"column":0},"end":{"row":1,"column":0},"action":"remove","lines":["",""],"id":3}],[{"start":{"row":0,"column":19},"end":{"row":0,"column":20},"action":"remove","lines":["n"],"id":4},{"start":{"row":0,"column":18},"end":{"row":0,"column":19},"action":"remove","lines":["a"]},{"start":{"row":0,"column":17},"end":{"row":0,"column":18},"action":"remove","lines":["H"]},{"start":{"row":0,"column":16},"end":{"row":0,"column":17},"action":"remove","lines":["2"]},{"start":{"row":0,"column":15},"end":{"row":0,"column":16},"action":"remove","lines":["n"]},{"start":{"row":0,"column":14},"end":{"row":0,"column":15},"action":"remove","lines":["e"]},{"start":{"row":0,"column":13},"end":{"row":0,"column":14},"action":"remove","lines":["Z"]}],[{"start":{"row":0,"column":13},"end":{"row":0,"column":14},"action":"insert","lines":["P"],"id":5},{"start":{"row":0,"column":14},"end":{"row":0,"column":15},"action":"insert","lines":["r"]},{"start":{"row":0,"column":15},"end":{"row":0,"column":16},"action":"insert","lines":["a"]},{"start":{"row":0,"column":16},"end":{"row":0,"column":17},"action":"insert","lines":["c"]},{"start":{"row":0,"column":17},"end":{"row":0,"column":18},"action":"insert","lines":["t"]},{"start":{"row":0,"column":18},"end":{"row":0,"column":19},"action":"insert","lines":["i"]},{"start":{"row":0,"column":19},"end":{"row":0,"column":20},"action":"insert","lines":["c"]}],[{"start":{"row":0,"column":20},"end":{"row":0,"column":21},"action":"insert","lines":["e"],"id":6},{"start":{"row":0,"column":21},"end":{"row":0,"column":22},"action":"insert","lines":["1"]},{"start":{"row":0,"column":22},"end":{"row":0,"column":23},"action":"insert","lines":["2"]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":5,"column":45},"end":{"row":5,"column":45},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1696162751996,"hash":"3237934dfa6f7af946957aadc80263b4b439fa1d"}