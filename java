// Sample array to store posted products (you would need a backend and database in a real implementation)
let products = [];

const productForm = document.getElementById("productForm");
const productList = document.getElementById("productList");

productForm.addEventListener("submit", (event) => {
  event.preventDefault();

  const productName = document.getElementById("productName").value;
  const productDescription = document.getElementById("productDescription").value;

  // Create a product object and add it to the products array
  const product = {
    name: productName,
    description: productDescription,
  };
  products.push(product);

  // Update the product list display
  displayProducts();

  // Clear the form fields
  document.getElementById("productName").value = "";
  document.getElementById("productDescription").value = "";
});

function displayProducts() {
  productList.innerHTML = "";
  products.forEach((product) => {
    const productElement = document.createElement("div");
    productElement.innerHTML = `
      <h3>${product.name}</h3>
      <p>${product.description}</p>
      <hr>
    `;
    productList.appendChild(productElement);
  });
}
