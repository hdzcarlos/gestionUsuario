package per.chc.spring.gestionUsuario.repository;

import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import per.chc.spring.gestionUsuario.entity.UsuarioEntity;

/**
 * Interfaz que se utiliza para implementar JpaRepository.
 */
@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    //@Query("SELECT * FORM usuario WHERE user = :user AND pass = :pass")

    /**
     * Metodo que busca un UsuarioEntity dando su user y pass
     * @param user
     * @param pass
     * @return
     */
    //UsuarioEntity findUsuarioEntitybyUserAndPass(@Param("user") String user,@Param("pass") String pass);
}
