package com.example.fab.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.fab.models.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Panadol", 0.625, true, "https://blueberrykw.com/pub/media/catalog/product/cache/2059a2bfcb898f541f056fd457afc8c8/p/a/panadol-advance-48-tablets.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Koflet Syrup", 1.750, true, "https://www.toysrus.co.za/media/catalog/product/cache/924d35e0c420b57e9fc2103a1522e700/8/9/8901138100629_imageoutofpack.png" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Posten Forte", 2.000, true, "https://pillintrip.com/style/images/medicines/ponstan-forte/ponstan-forte1.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Adol", 0.500, true, "https://dt0yvihh1z3w8.cloudfront.net/media/catalog/product/cache/70d0b31f5cd83c9994d9026a638f3158/383/6291100081394/Adol-Drop-15ml.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Vicks vaporub",  1.100, false, "https://m.media-amazon.com/images/I/410ijrbdxPL._AC_SY780_.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Vicks inhaler", 0.900, true, "https://res.cloudinary.com/mtree/image/upload/f_auto,q_auto/Vicks_PH/en-ph/-/media/Vicks_PH/Images/Products/2021/BabyRub/inhaler-1200.jpg?v=1-202111291447"));
        productList.add(new Product(UUID.randomUUID().toString(), "Otrivin", 2.800, true, "https://i-cf65.ch-static.com/content/dam/cf-consumer-healthcare/Otrivin/en_ME/Products/Otrivin_0.05_Spray_600x600-new.png?auto=format"));
        productList.add(new Product(UUID.randomUUID().toString(), "Moov Ointment", 1.800, true, "https://m.media-amazon.com/images/I/51sil4A27uL._SX679_.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Zycal Calcium Tablets", 5.000, true, "https://static.wixstatic.com/media/82e195_ee85212b2650441c88c20dca43442a6e~mv2.jpg/v1/fill/w_225,h_225,al_c,q_85/82e195_ee85212b2650441c88c20dca43442a6e~mv2.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Novalac Infant Milk Powder", 3.200, true, "https://www.farmacosmo.com/212771-large_default/novalac-1-infant-milk-powder-800-g-155028.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Panum 40", 6.250, true, "https://www.netmeds.com/images/product-v1/600x600/335789/panum_40mg_tablet_10_s_0.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sudocrem", 6.000, true, "https://m.media-amazon.com/images/I/71jySG1yiVL._AC_SL1500_.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Zynovate Cream", 1.600, true, "https://1.bp.blogspot.com/-uNz2F8v0zpU/X6l_nkb-18I/AAAAAAAATfs/y3YdEAxUEnMTWOEjE0uziGbMAPweaZegwCLcBGAsYHQ/w1200-h630-p-k-no-nu/Capture1.PNG"));

        mutableProductList.setValue(productList);
    }
}
