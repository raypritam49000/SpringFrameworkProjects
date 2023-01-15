<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-header bg-success text-white">
						<h3 class="text-center">Update User</h3>
					</div>

					<div class="card-body">

						<form action="${pageContext.request.contextPath}/updateUser" method="post">
						
						    <div class="mb-3">
								<label for="id" class="form-label">Enter ID</label> 
								<input type="text" class="form-control" id="id" name="id" value="${user.id}" placeholder="Enter Here" required="required">
							</div>
						
							<div class="mb-3">
								<label for="name" class="form-label">Enter Name</label> 
								<input type="text" class="form-control" id="name" name="name" value="${user.name}" placeholder="Enter Here" required="required">
							</div>
							
							<div class="mb-3">
								<label for="city" class="form-label">Enter City</label>
								<input type="text" class="form-control" id="city" name="city" value="${user.city}" placeholder="Enter Here" required="required" >
							</div>
							
							<div class="mb-3">
								<label for="salary" class="form-label">Enter Salary</label> 
								<input type="text" class="form-control" id="salary" name="salary" value="${user.salary}" placeholder="Enter Here" required="required">
							</div>
							
							<div class="container mt-2 text-center">
							  <button type="submit" class="btn btn-outline-primary">Update</button>
							  <button type="reset" class="btn btn-outline-danger">Reset</button>
							</div>
							
						</form>


					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>