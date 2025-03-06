package com.proyectos.FinanSmart.interfaz;


import com.fs.FinanSmart.entidades.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastoRepository  extends JpaRepository<Gasto, Long> {
}
