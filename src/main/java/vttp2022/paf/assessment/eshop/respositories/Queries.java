package vttp2022.paf.assessment.eshop.respositories;

public class Queries {
    
    //Task 3: Query to Check if user exists -- dont need anymore
    public static final String SQL_CHECK_IF_NAME_EXISTS = "SELECT EXISTS(SELECT * FROM customers WHERE name = ?) AS REPLY";

    //Task 3: Query to get customers detaila from eshop.customers table using name
    public static final String SQL_GET_CUSTDETAIL_BY_NAME = "select name, address, email from customers where name = ?";

    //Task 3 Query to insert into estore.orders
    public static final String SQL_INSERT_ORDER_INTO_ESTORE_ORDERS="insert into orders ";
}
