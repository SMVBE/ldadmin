<%@ include file="/common/taglibs.jsp"%>

<page:applyDecorator name="default">

<head>
    <title><fmt:message key="404.title"/></title>
    <meta name="heading" content="<fmt:message key='404.title'/>"/>
</head>

<p>
    <fmt:message key="404.message">
        <fmt:param><c:url value="/home"/></fmt:param>
    </fmt:message>
</p>
<p style="text-align: center">
    <a href="http://berlin.piratenpartei.de" title="404">
      <img src="/images/ppartei.png" width="200"  alt="404" style="margin: 20px; border: 0px solid black"></a>
</p>
</page:applyDecorator>