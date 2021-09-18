# RetailPriceApplication--1-
 Retail Discount


Exercise project writen in Spring Boot, which exposes an API such that given a bill, it finds the net discount.
Requirements:

Category A - If the user is an employee of the store, he gets a 30% discount
Category B- If the user is an affiliate of the store, he gets a 10% discount
Category C - If the user has been a customer for over 2 years, he gets a 5% discount.


Category D -For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount).
Category E -The percentage based discounts do not apply on groceries.

The solution exposes one rest end point - post method, which accepts the following structure for payment information:

{
	"userInfo": {
		"type": enumeration,
		"data": object
	},
	"amount": float,
	"otherData": object,
	"containsGroceries": boolean
}
The returned response has the following structure:

{
    "discount": float,
    "totalBill": floatr,
    "type": enumeration
}
The containsGroceries tells whether the purchased stocks include groceries.

The returned response has the following structure:

{
    "discount": float,
    "totalBill": float,
    "type": enumeration
}
Solution
Run mvn clean install to recompile sources. Run mvn test to run tests and generate code coverage report (placed in: /target/site/lentswe/index.html, open in browser to view). Run "RetailPriceApplication" class to start the server.
There are several data classes, describing the existing models in the project, mainly the discount and the payment.
Service based approach, where service classes are injected into other services.
There is a dedicated service, which calculates the discounts based on the payment information.
There is a service, which serves as a map between the user type and the logic, which should be applied to calculate the discount. The idea is to escape the numerous if-else or switch statements and get a complexity of 1. To every type of user, a discount type is mapped. Additionally, to every discount type, a "callback" function is mapped, which is the custom logic for calculating the discount.
Test approach:

There are several test classes, which simply assert that the services work correctly. There is one "integration" test for the rest service, which mocks http request and asserts that responses. Some of the test classes share the same test logic, so a dedicated parent class is defined for them. There are no test cases for the data classes, because they are simply getters and setters.
