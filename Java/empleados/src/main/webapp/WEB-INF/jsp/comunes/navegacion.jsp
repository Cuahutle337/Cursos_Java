<!-- Agregamos url de la aplicacion -->
<c:set var = "urlInicio">
	<c:url value = "${application.contextPath}/"/>
</c:set>
<c:set var = "urlAgregar">
	<c:url value = "${application.contextPath}/agregar"/>
</c:set>

<div class="container">
		<nav class="navbar navbar-expand-lg  bg-primary"
			data-bs-theme="dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="${urlInicio}">Sistemas de Empleados</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarText"
					aria-controls="navbarText" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarText">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="${urlInicio}">Inicio</a></li>
						<li class="nav-item"><a class="nav-link"
							href="${urlAgregar}">Agregar</a></li>
				</div>
			</div>
		</nav>
	</div>