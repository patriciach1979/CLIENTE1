package EFPATRICIACAÑARI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFPATRICIACAÑARI.Model.Cliente;
@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {

}
