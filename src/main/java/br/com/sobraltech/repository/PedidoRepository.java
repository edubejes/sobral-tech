package br.com.sobraltech.repository;
import br.com.sobraltech.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PedidoRepository extends JpaRepository<Pedido, Long> {}