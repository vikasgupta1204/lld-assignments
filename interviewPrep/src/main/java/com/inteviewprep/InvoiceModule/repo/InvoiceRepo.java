package com.inteviewprep.InvoiceModule.repo;

import com.inteviewprep.InvoiceModule.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice,Integer> {
}
