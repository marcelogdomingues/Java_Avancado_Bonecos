<%@page import="com.bonecos.kuscos.servlet.Listagem"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Bonecos | Aplica��o Web</title>
<link rel="icon" href="img/favicon.ico">

<!-- Icons font CSS-->
<link href="vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">
<link href="vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<!-- Font special for pages-->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">
<link href="vendor/simple-line-icons/css/simple-line-icons.css"
	rel="stylesheet">

<!-- Vendor CSS-->
<link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="vendor/datepicker/daterangepicker.css" rel="stylesheet"
	media="all">

<!-- Main CSS-->
<link href="css/main.css" rel="stylesheet" media="all">
<link href="css/stylish-portfolio.min.css" rel="stylesheet">
</head>

<body>
	<!-- Navigation -->
	<a class="menu-toggle rounded" href="#"> <i class="fas fa-bars"></i>
	</a>
	<nav id="sidebar-wrapper">
		<ul class="sidebar-nav">
			<li class="sidebar-brand"><a class="js-scroll-trigger"
				href="#page-top">Bonecos Aplica��o Web</a></li>
			<li class="sidebar-nav-item"><a class="js-scroll-trigger"
				href="index.html">Home</a></li>
			<li class="sidebar-nav-item"><a class="js-scroll-trigger"
				href="criar.html">Criar Candidato</a></li>
			<li class="sidebar-nav-item"><a class="js-scroll-trigger"
				href="lista.html">Lista Candidatos</a></li>
		</ul>
	</nav>


	<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
		<div class="wrapper wrapper--w680">
			<form method="get" action="servelet/Listagem">
				<div class="container-table100">
					<div class="wrap-table100">
						<div class="table100">
							<table>
								<thead>
									<tr class="table100-head">
										<th class="column1">ID:</th>
										<th class="column2">NOME:</th>
										<th class="column3">Data de Nascimento</th>
										<th class="column4">Data de Registo</th>
										<th class="column5">Morada</th>
										<th class="column6">Numero de CC</th>
										<th class="column7">Genero</th>
									</tr>
								</thead>
								<tbody>
									<%String listacli = request.getParameter("listaclientes"); %>
									<%int comp = listacli.length(); %>
									<% for (int i = 0; i < comp; i++ ) { %>
									
									<tr>
										<td class="column1"><%=listacli[i].getIdCliente()%></td>
										<td class="column2"><%=lista[i].getNome() %></td>
										<td class="column3"><%=lista[i].getDataNascimento()%></td>
										<td class="column4"><%=lista[i].getDataInsercao() %></td>
										<td class="column5"><%=lista[i].getMorada() %></td>
										<td class="column6"><%=lista[i].getNumeroCc() %></td>
										<td class="column7"><%=lista[i].getGenero()%></td>

									</tr>
									 <% } %>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>


	<!-- Jquery JS-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<!-- Vendor JS-->
	<script src="vendor/select2/select2.min.js"></script>
	<script src="vendor/datepicker/moment.min.js"></script>
	<script src="vendor/datepicker/daterangepicker.js"></script>

	<!-- Main JS-->
	<script src="js/global.js"></script>
	<script src="js/restricoes.js"></script>
	<script src="js/stylish-portfolio.min.js"></script>

</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->