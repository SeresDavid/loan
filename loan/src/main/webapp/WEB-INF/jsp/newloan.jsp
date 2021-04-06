<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common_header.jsp" %> 

    <div class="row">
    	<div class="col-sm-12">
    		<div class="jumbotron bg-dark text-white">
    			<h1 class="display-4 text-center"> Új hitelkérelem</h1>
    		</div>
    	</div>
    </div>
	<div class="row">
		<div class="col-sm-12">
			<form action="" method="POST">
				<div class="row">	
					<div class="col-sm-6">
						<div class="form-group">
							<label>Teljes név</label>
						 	<input type="text" class="form-control" name="fullName" required>
						</div>
						<div class="form-group">
							<label>Összeg</label>
						 	<input type="number" class="form-control" name="amount" required>
						</div>
						<div class="d-flex justify-content-between bg-dark text-white p-2">
							<a class="btn btn-warning" href="javascript:history.go(-1)"><i class="fas fa-arrow-left"></i> Vissza</a>
							<button class="btn btn-success" type="submit">Mentés <i class="fas fa-save"></i></button>
						</div>
						
					</div>
					
				</div>
			</form>
		</div>
	</div>

<%@include file="common_footer.jsp" %> 
