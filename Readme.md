<?xml version="1.0"?>
<!DOCTYPE module PUBLIC
    "-//Puppy Crawl//DTD Check Configuration 1.2//EN"
    "http://www.puppycrawl.com/dtds/configuration_1_2.dtd">

<!-- Checkstyle configuration that checks the sun coding conventions from: 
	- the Java Language Specification at http://java.sun.com/docs/books/jls/second_edition/html/index.html 
	- the Sun Code Conventions at http://java.sun.com/docs/codeconv/ - the Javadoc 
	guidelines at http://java.sun.com/j2se/javadoc/writingdoccomments/index.html 
	- the JDK Api documentation http://java.sun.com/j2se/docs/api/index.html 
	- some best practices Checkstyle is very configurable. Be sure to read the 
	documentation at http://checkstyle.sf.net (or in your downloaded distribution). 
	Most Checks are configurable, be sure to consult the documentation. To completely 
	disable a check, just comment it out or delete it from the file. Finally, 
	it is worth reading the documentation. -->

<module name="Checker">
	<module name="NewlineAtEndOfFile">
		<property name="severity" value="ignore" />
	</module>
	<module name="Translation" />
	<module name="FileLength" />
	<module name="FileTabCharacter"/>
	<module name="SuppressWithNearbyCommentFilter">
		<property name="commentFormat" value="NOPMD" />
		<property name="checkFormat" value=".*" />
		<property name="influenceFormat" value="0" />
	</module>
	<module name="SuppressionCommentFilter" />
	<module name="TreeWalker">
		<property name="cacheFile" value="${checkstyle.cache.file}" />
		<module name="FileContentsHolder" />
		<module name="SuppressWarningsHolder" />
		<module name="JavadocMethod">
			<property name="scope" value="protected" />
			<property name="logLoadErrors" value="true" />
			<property name="suppressLoadErrors" value="true" />
		</module>
		<module name="JavadocType" />
		<module name="JavadocVariable">
			<property name="severity" value="ignore" />
			<property name="scope" value="protected" />
		</module>
		<module name="JavadocStyle" />
		<module name="ConstantName">
			<property name="format"
				value="^([A-Z][A-Z0-9]*(_[A-Z0-9]+)*|logger)$" />
		</module>
		<module name="LocalFinalVariableName" />
		<module name="LocalVariableName" />
		<module name="MemberName" />
		<module name="MethodName" />
		<module name="PackageName" />
		<module name="ParameterName" />
		<module name="StaticVariableName" />
		<module name="TypeName" />
		<module name="AvoidStarImport" />
		<module name="IllegalImport" /> <!-- defaults to sun.* packages -->
		<module name="RedundantImport" />
		<module name="UnusedImports" />
		<module name="LineLength">
			<property name="severity" value="ignore" />
		</module>
		<module name="MethodLength" />
		<module name="ParameterNumber" />
		<module name="EmptyForIteratorPad" />
		<module name="MethodParamPad" />
		<module name="NoWhitespaceAfter">
			<property name="tokens"
				value="BNOT,DEC,DOT,INC,LNOT,UNARY_MINUS,UNARY_PLUS" />
		</module>
		<module name="NoWhitespaceBefore" />
		<module name="OperatorWrap" />
		<module name="ParenPad" />
		<module name="TypecastParenPad" />
		<module name="WhitespaceAfter" />
		<module name="WhitespaceAround" />
		<module name="ModifierOrder" />
		<module name="RedundantModifier" />
		<module name="AvoidNestedBlocks">
			<property name="allowInSwitchCase" value="true" />
		</module>
		<module name="EmptyBlock" />
		<module name="LeftCurly" />
		<module name="NeedBraces" />
		<module name="RightCurly">
			<property name="option" value="alone" />
			<property name="tokens" value="LITERAL_ELSE, METHOD_DEF"/>
		</module>
		<module name="AvoidInlineConditionals">
			<property name="severity" value="ignore" />
		</module>
		<module name="EmptyStatement" />
		<module name="EqualsHashCode" />
		<module name="HiddenField">
			<property name="tokens" value="VARIABLE_DEF" />
		</module>
		<module name="IllegalInstantiation" />
		<module name="InnerAssignment" />
		<module name="MagicNumber" />
		<module name="MissingSwitchDefault" />
		<module name="SimplifyBooleanExpression" />
		<module name="SimplifyBooleanReturn" />
		<module name="DesignForExtension">
			<property name="severity" value="ignore" />
		</module>
		<module name="FinalClass" />
		<module name="HideUtilityClassConstructor">
			<property name="severity" value="ignore" />
		</module>
		<module name="InterfaceIsType" />
		<module name="VisibilityModifier" />
		<module name="ArrayTypeStyle" />
		<module name="FinalParameters" />
		<module name="RegexpSinglelineJava">
			<property name="format" value="\s+$" />
			<property name="message" value="Line has trailing spaces." />
		</module>
		<module name="TodoComment" />
		<module name="UpperEll" />
		<module name="WhitespaceAround" />
		<module name="CyclomaticComplexity">
            <property name="severity" value="ignore"/>
        </module>
	</module>
	<module name="SuppressWarningsFilter" />
	<module name="UniqueProperties" />
</module>
