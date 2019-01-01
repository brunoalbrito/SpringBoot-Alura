package br.com.listvip.repository;

import br.com.listvip.model.Convidado;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadosRepository extends CrudRepository<Convidado,Long> {
}
