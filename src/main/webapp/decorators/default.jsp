<!DOCTYPE html>
<%@ include file="/common/taglibs.jsp"%>
<html lang="de">
<head>
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="icon" href="<c:url value="/images/favicon.ico"/>" />
<title><decorator:title /> | <fmt:message key="webapp.name" /></title>
<t:assets />
<decorator:head />
</head>
<body
	<decorator:getProperty property="body.id" writeEntireProperty="true"/>
	<decorator:getProperty property="body.class" writeEntireProperty="true"/>>
	<c:set var="currentMenu" scope="request">
		<decorator:getProperty property="meta.menu" />
	</c:set>

	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#navbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="<c:url value='/'/>"><fmt:message
					key="webapp.name" /></a>
		</div>

		<%@ include file="/common/menu.jsp"%>

	</div>

	<div class="container" id="content">
		<%@ include file="/common/messages.jsp"%>
		<div class="row">
			<decorator:body />

			<c:if test="${currentMenu == 'AdminMenu'}">
				<div class="col-sm-2">
					<menu:useMenuDisplayer name="Velocity" config="navlistMenu.vm"
						permissions="rolesAdapter">
						<menu:displayMenu name="AdminMenu" />
					</menu:useMenuDisplayer>
				</div>
			</c:if>
		</div>
	</div>


	<div id="footer" class="container navbar-fixed-bottom">
		<span class="col-sm-6 text-left"><fmt:message
				key="webapp.version" /> <c:if
				test="${pageContext.request.remoteUser != null}">
            | <fmt:message key="user.status" /> ${pageContext.request.remoteUser}
            </c:if> </span> <span class="col-sm-6 text-right"> <i class="fa fa-circle-o fa-1x" title="cc0" ></i>  <fmt:message
				key="copyright.year" /> <a href="<fmt:message key="company.url"/>"><fmt:message
					key="company.name" /></a>
		</span>
	</div>
	<%=(request.getAttribute("scripts") != null) ? request
					.getAttribute("scripts") : ""%>
</body>
</html>