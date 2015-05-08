<%@ include file="/common/taglibs.jsp"%>

<head>
<title><fmt:message key="userList.title" /></title>
<meta name="menu" content="MemberMenu" />
</head>
<div class="col-sm-12">
	<display:table name="memberList" cellspacing="0" cellpadding="0"
		requestURI="" defaultsort="1" id="members" pagesize="25"
		class="table table-condensed table-striped table-hover" export="false">
		<%-- <display:column property="name" escapeXml="true" sortable="true"
			titleKey="member.name" url="/admin/newMembersSubmit" paramId="name"
			paramProperty="name" /> --%>
		<display:column property="email" escapeXml="true" sortable="false"
			titleKey="member.email" url="/admin/newMembersSubmit" paramId="name"
			paramProperty="email" />


		<display:column property="firstname" escapeXml="true" sortable="false"
			titleKey="member.firstname" url="/admin/newMembersSubmit"
			paramId="firstname" paramProperty="firstname" />

		<display:column property="lastname" escapeXml="true" sortable="false"
			titleKey="member.lastname" url="/admin/newMembersSubmit"
			paramId="lastname" paramProperty="lastname" />

		<display:column property="membernumber" escapeXml="true"
			sortable="false" titleKey="member.membernumber"
			url="/admin/newMembersSubmit" paramId="membernumber"
			paramProperty="membernumber" />
		<display:column property="accreditation" escapeXml="true"
			sortable="false" titleKey="member.accreditation.info"
			url="/admin/newMembersSubmit" paramId="name"
			paramProperty="accreditation" />
	</display:table>
</div>


<!-- Submission Form -->

<div class="col-sm-12">


	<a class="btn btn-success btn-xs btn-block"
		href="${ctx}/admin/newMembersSubmit?go=1&file=${fileName}"
		title="<fmt:message key='ldadmin.menu.members.new' />"> <fmt:message
			key="ldadmin.members.submit.new.list">
			<fmt:param value="${memberList.size()}"></fmt:param>
		</fmt:message>
	</a>
</div>



