package com.inteviewprep.InvoiceModule.serviceImpl;

import com.inteviewprep.InvoiceModule.exceptions.InvoiceNotFoundException;
import com.inteviewprep.InvoiceModule.model.Invoice;
import com.inteviewprep.InvoiceModule.repo.InvoiceRepo;
import com.inteviewprep.InvoiceModule.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceRepo invoiceRepo;
    @Override
    public Invoice saveInvoice(Invoice inv) {
        return invoiceRepo.save(inv);
    }

    @CachePut(value = "Invoice",key="#invId")
    @Override
    public Invoice updateInvoice(Invoice inv, Integer invId) {
        Invoice invoice=invoiceRepo.findById(invId).orElseThrow(()->new InvoiceNotFoundException("Invoice not found"));
        invoice.setInvAmount(inv.getInvAmount());
        invoice.setInvName(inv.getInvName());
        return invoiceRepo.save(invoice);
    }

    @CacheEvict(value = "Invoice",key="#invId")
    @Override
    public void deleteInvoice(Integer invId) {
        Invoice invoice=invoiceRepo.findById(invId).orElseThrow(()->new InvoiceNotFoundException("Invoice not found"));
        invoiceRepo.delete(invoice);
    }

    @Cacheable(value = "Invoice",key="#invId")
    @Override
    public Invoice getOneInvoice(Integer invId) {
        Invoice invoice=invoiceRepo.findById(invId).orElseThrow(()->new InvoiceNotFoundException("Invoice not found"));

        return invoice;
    }

    @Cacheable(value = "Invoice")
    @Override
    public List<Invoice> getAllInvoices() {
        return invoiceRepo.findAll();
    }
}
