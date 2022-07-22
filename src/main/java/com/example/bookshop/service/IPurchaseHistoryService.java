package com.example.bookshop.service;


import java.util.List;

import com.example.bookshop.model.PurchaseHistory;
import com.example.bookshop.repository.projection.IPurchaseItem;

public interface IPurchaseHistoryService
{
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
