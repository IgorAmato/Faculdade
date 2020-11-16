 /**
     * Interface pattern Strategy.
     */
    public interface Strategy {

        // Calcula comissão.
        double calcularComissao(double valorVenda);
    }

    /**
     * Enumeration de cargos.
     * Cada classe da enumeração define uma das estratégias possíveis de comissão
     */
    public enum Cargo implements Strategy{
        ATENDENTE {
            @Override
            public double calcularComissao(double valorVenda) {
                return (valorVenda * 0.01);
            }
        },
        VENDEDOR {
            @Override
            public double calcularComissao(double valorVenda) {
                return (valorVenda * 0.02);
            }
        },
        GERENTE {
            @Override
            public double calcularComissao(double valorVenda) {
                return (100 + valorVenda * 0.03);
            }
        };
    }

    /**
     * Dados do funcionario.
     */
    public class Funcionario {
        private long id;
        /**
         * Definimos no corpo qual o tipo de implementação nossa
         * variável cargo deverá receber (novos tipos podem surgir
         * sem que haja muitos impactos), ex: cargo = Cargo.VENDEDOR;.
         */
        private Strategy cargo;
        // Construtor, getters e setters
        . . .
    }

    /**
     * Classe que calcula comissão de venda.
     */
    public class Venda {

        private double valorVenda;
        private Funcionario funcionario;

        //Gets e setters

        public void save() {
            /*
             * Calcula o valor da comissão de venda sem que haja a necessidade de
             * usar um switch para o tipo de cargo toda vez que o método <b>save</b> for executado.
             */
            final double valorComissao = this.funcionario.getCargo().calcularComissao(this.valorVenda);
            // . . .
        }
    }
