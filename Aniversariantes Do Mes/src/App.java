
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        AniversariantesDoMes app = new AniversariantesDoMes();
        
        String op = queryByChoice(options());
        app.query(op);
        
    }

    private static int options() {
        JFrame frame = new JFrame();
        String[] optionz = { "Aniversariantes do Mes Atual", "Aniversariantes de um Mes específico" };
        int escolha = JOptionPane.showOptionDialog(frame.getContentPane(), "Qual consulta gostaria de fazer?", "Title", 0,
                JOptionPane.INFORMATION_MESSAGE, null, optionz, null);
        return escolha;
    }

    private static String queryByChoice(int i) {
        if (i == 0) {
            return "select id,nome as Nome, DAY(data_nascimento) as 'Dia do Aniversario' from funcionarios where MONTH(data_nascimento) = MONTH(Current_Date());";
        }
        else if (i==1){
            String month = JOptionPane.showInputDialog(null, "Digite o mes (numero) que deseja consultar");
            int queryMonth = month_choser(month);
            return "select id,nome as Nome, DAY(data_nascimento) as 'Dia do Aniversario' from funcionarios where MONTH(data_nascimento) = "+queryMonth+";";

        }
        return null;
    }

    private static int month_choser(String s) {
        return Integer.parseInt(s);
    }
}
