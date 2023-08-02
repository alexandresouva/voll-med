package med.voll.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;
import med.voll.api.medico.Especialidade;

@Table(name = "pacientes")

// Especifica o nome da classe que será mapeada pelo JPA
// Seus atributos serão colunas, suas instâncias registros no DB
@Entity(name = "Paciente")

// Lombok e a simplificação de códigos repetitivos
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Paciente {

//    Criação do ID (primary key) de maneira auto incrementável
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

//    Embedded significa que endereço será armazenada como parte da tabela Endereço
    @Embedded
    private Endereco endereco;

//  Construtor
    public Paciente(DadosCadastroPaciente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());
    }
}
