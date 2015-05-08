<%@ include file="/common/taglibs.jsp"%>

<head>
<title><fmt:message key="home.title" /></title>
<meta name="menu" content="Home" />
</head>
<body class="home">

	<h2>
		<fmt:message key="home.heading" />
	</h2>
	<p>
		<fmt:message key="home.message" />
	</p>

	<ul class="fa-ul">
		<%-- <li><a href="<c:url value='/userform'/>"><fmt:message
					key="menu.user" /></a></li>
					 --%>
		
<li><a href="<c:url value='/admin/upload/new'/>"><i
				class="fa-li fa fa-upload"> </i>
			<fmt:message key="ldadmin.menu.members.new.fileupload" /></a></li>

		<li><a href="<c:url value='/admin/upload/pseudonym'/>"><i
				class="fa-li fa fa-upload"> </i>
			<fmt:message key="ldadmin.menu.members.pseudonym.fileupload" /></a></li>

		<li><a href="<c:url value='/admin/upload/leaving'/>"><i
				class="fa-li fa fa-upload"> </i>
			<fmt:message key="ldadmin.menu.members.leaving.fileupload" /></a></li>
			
			
			
			<li><a href="<c:url value='/admin/newMembers'/>"><i
				class="fa-li fa fa-check-square-o"> </i>
			<fmt:message key="ldadmin.menu.members.new" /></a></li>

		<li><a href="<c:url value='/admin/pseudonymMembers'/>"><i
				class="fa-li fa fa-check-square-o"> </i>
			<fmt:message key="ldadmin.menu.members.pseudonym" /></a></li>

		<li><a href="<c:url value='/admin/leavingMembers'/>"><i
				class="fa-li fa fa-check-square-o"> </i>
			<fmt:message key="ldadmin.menu.members.leaving" /></a></li>

	</ul>
</body>
