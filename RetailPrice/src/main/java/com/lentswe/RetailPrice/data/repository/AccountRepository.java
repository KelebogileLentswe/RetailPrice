package.com.lentswe.RetailPrice.data.repository;

import com.lentswe.RetailPrice.data.models.Account;
import com.lentswe.RetailPrice.data.models.OrderDetail;
import org.springframework.data.repoistory.jpa.JpaRepository;
import com.lentswe.RetailPrice.data.models.Product;
import org.springframework.stereotype.Repository;

@Repository

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
public interface  AccountRepository extends JpaRepository<Order, Integer>{

}
public interface AccountRepository extends JpaRepository<Product, Integer>{
	
}