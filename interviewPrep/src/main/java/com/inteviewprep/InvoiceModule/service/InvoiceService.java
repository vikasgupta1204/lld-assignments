package com.inteviewprep.InvoiceModule.service;

import com.inteviewprep.InvoiceModule.model.Invoice;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface InvoiceService {

    public Invoice saveInvoice(Invoice inv);
    public Invoice updateInvoice(Invoice inv, Integer invId);
    public void deleteInvoice(Integer invId);
    public Invoice getOneInvoice(Integer invId);
    public List<Invoice> getAllInvoices();
}
