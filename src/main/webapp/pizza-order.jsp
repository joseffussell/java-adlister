<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza</title>
</head>
<body>
  <h1>Order Your Pizza</h1>
    <form action="/pizza-order" method="post">
      <div class="form-group">
          <label>Crust Type</label>
          <input id="crust-type" name="crust-type" class="form-control" type="text">
      </div>
      <div class="form-group">
          <label>Sauce Type</label>
          <input id="sauce-type" name="sauce-type" class="form-control" type="text">
      </div>
      <div class="form-group">
          <label>Size Type</label>
          <select name="size-type">
              <option value="small" selected>Small</option>
              <option value="medium">Medium</option>
          </select>
      </div>
      <div class="form-group">
          <label>Toppings</label>
          <fieldset>
              <input type="checkbox" name="toppings[]" value="cheese">
              <input type="checkbox" name="toppings[]" value="pepperoni">
          </fieldset>
      </div>
      <div class="form-group">
          <label>Delivery Address</label>
          <input name="delivery-address" type="text">
      </div>
      <div class="form-group">
          <input type="submit" class="btn btn-primary btn-block" value="Submit">
      </div>
    </form>
</body>
</html>
