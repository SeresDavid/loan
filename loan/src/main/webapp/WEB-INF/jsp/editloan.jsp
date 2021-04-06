<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common_header.jsp" %> 
   
   
   
    <div class="row">
    	<div class="col-sm-12">
    		<div class="jumbotron bg-dark text-white">
    			<h1 class="display-4 text-center"> Hitelkérelem módosítás</h1>
    		</div>
    	</div>
    </div>
	<div class="row">
		<div class="col-sm-12">
			<form action="" method="POST">
				<input type="hidden" name="id" value="${loan.id}">
				<input type="hidden" name="status" value="${loan.status}">
				<div class="row">	
					<div class="col-sm-6">
						<div class="form-group">
							<label>Teljes név</label>
						 	<input type="text" class="form-control" name="fullName" value="${loan.fullName}" required>
						</div>
						<div class="form-group">
							<label>Összeg</label>
						 	<input type="number" class="form-control" value="${loan.amount}" name="amount" required>
						</div>
						<div class="d-flex justify-content-between bg-dark text-white p-2">
							<a class="btn btn-warning" href="javascript:history.go(-1)"><i class="fas fa-arrow-left"></i> Vissza</a>
							<button class="btn btn-success" type="submit">Módosít <i class="fas fa-save"></i></button>
						</div>
						
					</div>
					
				</div>
			</form>
		</div>
	</div>

<%@include file="common_footer.jsp" %> 
