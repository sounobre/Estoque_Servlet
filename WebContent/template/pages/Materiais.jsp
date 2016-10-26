<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Estoque</title>

<!-- Bootstrap Core CSS -->
<link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="../dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="../vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

	<jsp:include page="Menu"></jsp:include>

	<!-- Page Content -->
	<div id="page-wrapper">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Materiais</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container-fluid -->
<form action="Materiais.jsp" method="post">
		<div class="container">

			<ul class="nav nav-tabs">
				<li class="active"><a data-toggle="tab" href="#home">Materiais</a></li>
				<li><a data-toggle="tab" href="#menu1">Princípio Ativo</a></li>
				<li><a data-toggle="tab" href="#menu2">Unidades</a></li>
				<li><a data-toggle="tab" href="#menu3">Classes</a></li>
				<li><a data-toggle="tab" href="#menu3">Grupos</a></li>
				<li><a data-toggle="tab" href="#menu3">Subgrupos</a></li>
			</ul>

			<div class="tab-content">
				<div id="home" class="tab-pane fade in active">


					<div class="panel panel-default">
						<div class="panel-heading">


							<ul class="nav" id="pesquisa-materiais">
								<li class="sidebar-search">
									<div class="input-group custom-search-form">
										<select class="form-control" style="width: 10% !important">
											<option value="codigo">Código</option>
											<option value="codigoMaterial">Cód. Material</option>
											<option value="descricao">Descrição</option>
											<option value="estoque">Estoque</option>
											<option value="estoqueMin">Estoque Min.</option>
											<option value="estoqueMax">Estoque Max</option>

										</select> <input type="text" class="form-control"
											style="width: 40% !important" name="editPesquisa" placeholder="Pesquisar...">
										<span class="input-group-btn">
											<button class="btn btn-default" type="submit"
												style="margin-right: 100px">
												<i class="fa fa-search"></i>
											</button>
										</span>
									</div>

								</li>
							</ul>

						</div>
</form>							
						<div class="panel-body">
						
						<c:if test="${fn.length(lista) > 0 }" >
								<table style="width: 100%">
										<tr>
											<th>Código</th>	
											<th>Cód. Material</th>
											<th>Descrição</th>
											<th>Estoque Mín</th>
											<th>Estoque Máx</th>
										</tr>
									<c:forEach items="${lista }" var="mat">
										<tr>
											<th>${mat.CODIGO }</th>
											<th>${mat.CODIGO_MATERIAL }</th>
											<th>${mat.DESCRICAO }</th>
											<th>${mat.ESTOQUE_MINIMO }</th>
											<th>${mat.ESTOQUE_MAXIMO }</th>	
										</tr>
									</c:forEach>										
								</table>
								
						</c:if>	
						dsfasdfasdfasdfasdf
						</div>
					</div>
				</div>
			
				<div id="menu1" class="tab-pane fade">
					<h3>Menu 1</h3>
					<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
						laboris nisi ut aliquip ex ea commodo consequat.</p>
				</div>
				<div id="menu2" class="tab-pane fade">
					<h3>Menu 2</h3>
					<p>Sed ut perspiciatis unde omnis iste natus error sit
						voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
				</div>
				<div id="menu3" class="tab-pane fade">
					<h3>Menu 3</h3>
					<p>Eaque ipsa quae ab illo inventore veritatis et quasi
						architecto beatae vitae dicta sunt explicabo.</p>
				</div>
			</div>
		</div>
	</div>
	<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="../vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="../vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="../dist/js/sb-admin-2.js"></script>

	
	
</body>

</html>
