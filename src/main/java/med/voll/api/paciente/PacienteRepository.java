package med.voll.api.paciente;

import org.springframework.data.jpa.repository.JpaRepository;

// A função de um repository é criar uma abstração de acesso e gestão ao DB
// Ao extender a classe JpaRepository, herda-se métodos úteis de persistência

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
// Paciente -> Entidade gerenciada pelo repository
// Long -> Tipo de dado da primary key da entidade mapeada

}
