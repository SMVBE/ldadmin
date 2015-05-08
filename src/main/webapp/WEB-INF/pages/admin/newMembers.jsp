<%@ include file="/common/taglibs.jsp"%>

<head>
<title><fmt:message key="ldadmin.menu.members" /></title>
<meta name="menu" content="MemberMenu" />
</head>

<c:if test="${not empty searchError}">
	<div class="alert alert-danger alert-dismissable">
		<a href="#" data-dismiss="alert" class="close">&times;</a>
		<c:out value="${searchError}" />
	</div>
</c:if>
<c:if test="${not empty status.errorMessages}">
	<div class="alert alert-danger alert-dismissable">
		<a href="#" data-dismiss="alert" class="close">&times;</a>
		<c:forEach var="error" items="${status.errorMessages}">
			<c:out value="${error}" escapeXml="false" />
			<br />
		</c:forEach>
	</div>
</c:if>
<div class="col-sm-12">
	<display:table name="fileList" cellspacing="0" cellpadding="0"
		requestURI="" defaultsort="1" id="files" pagesize="25"
		class="table table-condensed table-striped table-hover" export="false">
		<display:column property="name" escapeXml="true" sortable="true"
			titleKey="file.name" url="/admin/newMembersSubmit" paramId="file"
			paramProperty="name" />
		<display:column property="length" sortable="true"
			titleKey="file.length" paramId="length" paramProperty="length"
			format="{0,number,#.##} kB" />
		<display:column property="lastModified" sortProperty="lastModified"
			sortable="true" titleKey="file.lastModified" paramId="lastModified"
			paramProperty="lastModified" />
		<display:column escapeXml="false" sortable="false"
			titleKey="ldadmin.files.delete" url="/admin/newMembers"
			paramId="deleteFile" paramProperty="name" style="text-align: center">
			<i class="fa fa-remove"></i>
		</display:column>
	</display:table>
</div>
<div class="col-sm-12" style="text-align:left">
	<blockquote>
		${protocol}
	</blockquote>
</div>
<div class="col-sm-12">
	<display:table name="protocolList" cellspacing="0" cellpadding="0"
		requestURI="" defaultsort="0" defaultorder="descending" id="protocols" pagesize="100"
		class="table table-condensed table-striped table-hover" export="false">
		<display:column property="name" escapeXml="true" sortable="true"
			titleKey="protocol.name" autolink="false" paramId="file"
			paramProperty="name" />

		<display:column escapeXml="false" sortable="false" 
			titleKey="protocol.view" url="/admin/newMembers" paramId="protocol"
			paramProperty="name">
			<i class="fa fa-th-list"> </i>


		</display:column>
	</display:table>
</div>


