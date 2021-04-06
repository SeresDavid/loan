<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common_header.jsp" %> 

    <div class="row">
    	<div class="col-sm-12">
    		<div class="jumbotron bg-dark text-white">
    			<h1 class="display-4 text-center"> Hitelkérelem törlése</h1>
    		</div>
    	</div>
    </div>
	<div class="row">
		<div class="col-sm-12">
			<form action="" method="POST">
				<div class="row">	
					<div class="col-sm-6">
						<input type="hidden" name="id" value="${loan.id}">
						<div class="d-flex justify-content-between bg-dark text-white p-2">
							<a class="btn btn-warning" href="javascript:history.go(-1)"><i class="fas fa-arrow-left"></i> Vissza</a>
							<h3>Azonosító: ${loan.id}</h3>
							<button class="btn btn-danger" type="submit">Törlés <i class="fas fa-trash"></i></button>
						</div>
						
					</div>
					
				</div>
			</form>
		</div>
	</div>

<%@include file="common_footer.jsp" %> 

