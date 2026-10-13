package br.com.sobraltech.repository;
import br.com.sobraltech.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}