<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:tns="http://www.example.org/ServiceBanque">
    <xsl:output method="xml" indent="yes"/>
    
        <!-- Variable pour la somme totale des soldes -->
    <xsl:variable name="totalSolde" select="sum(tns:Compte/tns:solde)"/>

    <!-- Variable pour la somme totale des soldes des comptes filtrés -->
    <xsl:variable name="totalSoldeFiltré" select="sum(tns:Compte[tns:dateCreation >= '2001-01-01']/tns:solde)"/>
    
    <!-- Règles de transformation pour les éléments <getComptes> -->
    <xsl:template match="tns:Compte">
        <tr>
            <td><xsl:value-of select="tns:code"/></td>
            <td><xsl:value-of select="tns:solde"/></td>
            <td><xsl:value-of select="tns:dateCreation"/></td>
        </tr>
    </xsl:template>
    
    <!-- Règle de transformation pour l'en-tête du tableau -->
    <xsl:template match="tns:BanqueService">
        <html>
            <head>
                <title>Transformation de BanqueService</title>
            </head>
            <body>
                <h1>Liste des comptes</h1>
                <table border="1">
                    <tr>
                        <th>Code</th>
                        <th>Solde</th>
                        <th>Date de Création</th>
                    </tr>
                    <!-- Appliquer la transformation pour chaque compte -->
                    <xsl:apply-templates select="tns:Compte"/>
                </table>
                
                <p>Somme totale des soldes : <xsl:value-of select="$totalSolde"/></p>
                
                <h2>Liste des comptes créés après 2000</h2>
                <table border="1">
                    <tr>
                        <th>Code</th>
                        <th>Solde</th>
                        <th>Date de Création</th>
                    </tr>
                    <!-- Appliquer la transformation pour les comptes créés après 2000 -->
                    <xsl:apply-templates select="tns:Compte[tns:dateCreation >= '2001-01-01']"/>
                </table>
                
                  <p>Somme totale des soldes des comptes filtrés : <xsl:value-of select="$totalSoldeFiltré"/></p>
                  
            </body>
        </html>
    </xsl:template>
     <!-- Règle de transformation pour générer le fichier "out.xml" -->
    <xsl:template match="/">
        <xsl:result-document method="xml" href="out.xml">
            <xsl:apply-templates select="tns:BanqueService"/>
        </xsl:result-document>
    </xsl:template>
</xsl:stylesheet>
