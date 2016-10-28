package model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class MATERIAIS {
	
	@Id
	@Column
	private String CODIGO;
	@Column
	private String DESCRICAO;
	@Column
	private String UNIDADE;
	@Column
	private String CODMATCOBRANCA;
	@Column
	private String COD_AHCRJ;
	@Column
	private String COD_BRASINDICE;
	@Column
	private String COD_SIMPRO;
	@Column
	private String USUARIO_CRICAO;
	@Column
	private String USUARIO_ALTERACAO;
	@Column
	private String EMPRESA;
	@Column
	private String CODSUBGRUPO;
	@Column
	private String REGISTRO_ANVISA;
	@Column
	private String REFERENCIA_FABRICANTE;
	@Column
	private String AUT_FUNCIONAMENTO;
	@Column
	private String TIPO;
	@Column
	private String EXCLUIDO;
	@Column
	private String AVISO_ESTOQUE_MINIMO;
	@Column
	private String STATUS;
	@Column
	private String HABILITADO;
	@Column
	private String CLASSIFICACAO;
	@Column
	private Long CODIGO_MATERIAL;
	@Column
	private Integer CODIGO_BARRA;
	@Column
	private Integer ID_UNIDADE;
	@Column
	private Integer ID_SUBGRUPO;
	@Column
	private Integer ID_PRINCIPIO_ATIVO;
	@Column
	private Integer ID_ARMAZENAMENTO;
	@Column
	private Integer TEMPO_MEDIO_RESSUPRIMENTO;
	@Column
	private Double  PRECO;
	@Column
	private Double  PRECO_COMPRA;
	@Column
	private Double  ESTOQUE_MINIMO;
	@Column
	private Double  ESTOQUE_MAXIMO;
	@Column
	private Double  ESTOQUE;
	@Column
	private Double  QUANTIDADE_AVISO;
	@Column
	private Double  VALOR_MEDIO;
	@Column
	private Double  ESTOQUE_SEGURANCA;
	@Column
	private Double  DEMANDA_MEDIA_DIARIA;
	@Column
	private Date DATA_CRIACAO;
	@Column
	private Date DATA_ALTERACAO;
	
	public MATERIAIS(String cODIGO, String dESCRICAO, String uNIDADE, String cODMATCOBRANCA, String cOD_AHCRJ,
			String cOD_BRASINDICE, String cOD_SIMPRO, String uSUARIO_CRICAO, String uSUARIO_ALTERACAO, String eMPRESA,
			String cODSUBGRUPO, String rEGISTRO_ANVISA, String rEFERENCIA_FABRICANTE, String aUT_FUNCIONAMENTO,
			String tIPO, String eXCLUIDO, String aVISO_ESTOQUE_MINIMO, String sTATUS, String hABILITADO,
			String cLASSIFICACAO, Long cODIGO_MATERIAL, Integer cODIGO_BARRA, Integer iD_UNIDADE, Integer iD_SUBGRUPO,
			Integer iD_PRINCIPIO_ATIVO, Integer iD_ARMAZENAMENTO, Integer tEMPO_MEDIO_RESSUPRIMENTO, Double pRECO,
			Double pRECO_COMPRA, Double eSTOQUE_MINIMO, Double eSTOQUE_MAXIMO, Double eSTOQUE, Double qUANTIDADE_AVISO,
			Double vALOR_MEDIO, Double eSTOQUE_SEGURANCA, Double dEMANDA_MEDIA_DIARIA, Date dATA_CRIACAO,
			Date dATA_ALTERACAO) {
		super();
		CODIGO = cODIGO;
		DESCRICAO = dESCRICAO;
		UNIDADE = uNIDADE;
		CODMATCOBRANCA = cODMATCOBRANCA;
		COD_AHCRJ = cOD_AHCRJ;
		COD_BRASINDICE = cOD_BRASINDICE;
		COD_SIMPRO = cOD_SIMPRO;
		USUARIO_CRICAO = uSUARIO_CRICAO;
		USUARIO_ALTERACAO = uSUARIO_ALTERACAO;
		EMPRESA = eMPRESA;
		CODSUBGRUPO = cODSUBGRUPO;
		REGISTRO_ANVISA = rEGISTRO_ANVISA;
		REFERENCIA_FABRICANTE = rEFERENCIA_FABRICANTE;
		AUT_FUNCIONAMENTO = aUT_FUNCIONAMENTO;
		TIPO = tIPO;
		EXCLUIDO = eXCLUIDO;
		AVISO_ESTOQUE_MINIMO = aVISO_ESTOQUE_MINIMO;
		STATUS = sTATUS;
		HABILITADO = hABILITADO;
		CLASSIFICACAO = cLASSIFICACAO;
		CODIGO_MATERIAL = cODIGO_MATERIAL;
		CODIGO_BARRA = cODIGO_BARRA;
		ID_UNIDADE = iD_UNIDADE;
		ID_SUBGRUPO = iD_SUBGRUPO;
		ID_PRINCIPIO_ATIVO = iD_PRINCIPIO_ATIVO;
		ID_ARMAZENAMENTO = iD_ARMAZENAMENTO;
		TEMPO_MEDIO_RESSUPRIMENTO = tEMPO_MEDIO_RESSUPRIMENTO;
		PRECO = pRECO;
		PRECO_COMPRA = pRECO_COMPRA;
		ESTOQUE_MINIMO = eSTOQUE_MINIMO;
		ESTOQUE_MAXIMO = eSTOQUE_MAXIMO;
		ESTOQUE = eSTOQUE;
		QUANTIDADE_AVISO = qUANTIDADE_AVISO;
		VALOR_MEDIO = vALOR_MEDIO;
		ESTOQUE_SEGURANCA = eSTOQUE_SEGURANCA;
		DEMANDA_MEDIA_DIARIA = dEMANDA_MEDIA_DIARIA;
		DATA_CRIACAO = dATA_CRIACAO;
		DATA_ALTERACAO = dATA_ALTERACAO;
	}
	public MATERIAIS() {
		super();
	}
	public String getCODIGO() {
		return CODIGO;
	}
	public void setCODIGO(String cODIGO) {
		CODIGO = cODIGO;
	}
	public String getDESCRICAO() {
		return DESCRICAO;
	}
	public void setDESCRICAO(String dESCRICAO) {
		DESCRICAO = dESCRICAO;
	}
	public String getUNIDADE() {
		return UNIDADE;
	}
	public void setUNIDADE(String uNIDADE) {
		UNIDADE = uNIDADE;
	}
	public String getCODMATCOBRANCA() {
		return CODMATCOBRANCA;
	}
	public void setCODMATCOBRANCA(String cODMATCOBRANCA) {
		CODMATCOBRANCA = cODMATCOBRANCA;
	}
	public String getCOD_AHCRJ() {
		return COD_AHCRJ;
	}
	public void setCOD_AHCRJ(String cOD_AHCRJ) {
		COD_AHCRJ = cOD_AHCRJ;
	}
	public String getCOD_BRASINDICE() {
		return COD_BRASINDICE;
	}
	public void setCOD_BRASINDICE(String cOD_BRASINDICE) {
		COD_BRASINDICE = cOD_BRASINDICE;
	}
	public String getCOD_SIMPRO() {
		return COD_SIMPRO;
	}
	public void setCOD_SIMPRO(String cOD_SIMPRO) {
		COD_SIMPRO = cOD_SIMPRO;
	}
	public String getUSUARIO_CRICAO() {
		return USUARIO_CRICAO;
	}
	public void setUSUARIO_CRICAO(String uSUARIO_CRICAO) {
		USUARIO_CRICAO = uSUARIO_CRICAO;
	}
	public String getUSUARIO_ALTERACAO() {
		return USUARIO_ALTERACAO;
	}
	public void setUSUARIO_ALTERACAO(String uSUARIO_ALTERACAO) {
		USUARIO_ALTERACAO = uSUARIO_ALTERACAO;
	}
	public String getEMPRESA() {
		return EMPRESA;
	}
	public void setEMPRESA(String eMPRESA) {
		EMPRESA = eMPRESA;
	}
	public String getCODSUBGRUPO() {
		return CODSUBGRUPO;
	}
	public void setCODSUBGRUPO(String cODSUBGRUPO) {
		CODSUBGRUPO = cODSUBGRUPO;
	}
	public String getREGISTRO_ANVISA() {
		return REGISTRO_ANVISA;
	}
	public void setREGISTRO_ANVISA(String rEGISTRO_ANVISA) {
		REGISTRO_ANVISA = rEGISTRO_ANVISA;
	}
	public String getREFERENCIA_FABRICANTE() {
		return REFERENCIA_FABRICANTE;
	}
	public void setREFERENCIA_FABRICANTE(String rEFERENCIA_FABRICANTE) {
		REFERENCIA_FABRICANTE = rEFERENCIA_FABRICANTE;
	}
	public String getAUT_FUNCIONAMENTO() {
		return AUT_FUNCIONAMENTO;
	}
	public void setAUT_FUNCIONAMENTO(String aUT_FUNCIONAMENTO) {
		AUT_FUNCIONAMENTO = aUT_FUNCIONAMENTO;
	}
	public String getTIPO() {
		return TIPO;
	}
	public void setTIPO(String tIPO) {
		TIPO = tIPO;
	}
	public String getEXCLUIDO() {
		return EXCLUIDO;
	}
	public void setEXCLUIDO(String eXCLUIDO) {
		EXCLUIDO = eXCLUIDO;
	}
	public String getAVISO_ESTOQUE_MINIMO() {
		return AVISO_ESTOQUE_MINIMO;
	}
	public void setAVISO_ESTOQUE_MINIMO(String aVISO_ESTOQUE_MINIMO) {
		AVISO_ESTOQUE_MINIMO = aVISO_ESTOQUE_MINIMO;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getHABILITADO() {
		return HABILITADO;
	}
	public void setHABILITADO(String hABILITADO) {
		HABILITADO = hABILITADO;
	}
	public String getCLASSIFICACAO() {
		return CLASSIFICACAO;
	}
	public void setCLASSIFICACAO(String cLASSIFICACAO) {
		CLASSIFICACAO = cLASSIFICACAO;
	}
	public Long getCODIGO_MATERIAL() {
		return CODIGO_MATERIAL;
	}
	public void setCODIGO_MATERIAL(Long cODIGO_MATERIAL) {
		CODIGO_MATERIAL = cODIGO_MATERIAL;
	}
	public Integer getCODIGO_BARRA() {
		return CODIGO_BARRA;
	}
	public void setCODIGO_BARRA(Integer cODIGO_BARRA) {
		CODIGO_BARRA = cODIGO_BARRA;
	}
	public Integer getID_UNIDADE() {
		return ID_UNIDADE;
	}
	public void setID_UNIDADE(Integer iD_UNIDADE) {
		ID_UNIDADE = iD_UNIDADE;
	}
	public Integer getID_SUBGRUPO() {
		return ID_SUBGRUPO;
	}
	public void setID_SUBGRUPO(Integer iD_SUBGRUPO) {
		ID_SUBGRUPO = iD_SUBGRUPO;
	}
	public Integer getID_PRINCIPIO_ATIVO() {
		return ID_PRINCIPIO_ATIVO;
	}
	public void setID_PRINCIPIO_ATIVO(Integer iD_PRINCIPIO_ATIVO) {
		ID_PRINCIPIO_ATIVO = iD_PRINCIPIO_ATIVO;
	}
	public Integer getID_ARMAZENAMENTO() {
		return ID_ARMAZENAMENTO;
	}
	public void setID_ARMAZENAMENTO(Integer iD_ARMAZENAMENTO) {
		ID_ARMAZENAMENTO = iD_ARMAZENAMENTO;
	}
	public Integer getTEMPO_MEDIO_RESSUPRIMENTO() {
		return TEMPO_MEDIO_RESSUPRIMENTO;
	}
	public void setTEMPO_MEDIO_RESSUPRIMENTO(Integer tEMPO_MEDIO_RESSUPRIMENTO) {
		TEMPO_MEDIO_RESSUPRIMENTO = tEMPO_MEDIO_RESSUPRIMENTO;
	}
	public Double getPRECO() {
		return PRECO;
	}
	public void setPRECO(Double pRECO) {
		PRECO = pRECO;
	}
	public Double getPRECO_COMPRA() {
		return PRECO_COMPRA;
	}
	public void setPRECO_COMPRA(Double pRECO_COMPRA) {
		PRECO_COMPRA = pRECO_COMPRA;
	}
	public Double getESTOQUE_MINIMO() {
		return ESTOQUE_MINIMO;
	}
	public void setESTOQUE_MINIMO(Double eSTOQUE_MINIMO) {
		ESTOQUE_MINIMO = eSTOQUE_MINIMO;
	}
	public Double getESTOQUE_MAXIMO() {
		return ESTOQUE_MAXIMO;
	}
	public void setESTOQUE_MAXIMO(Double eSTOQUE_MAXIMO) {
		ESTOQUE_MAXIMO = eSTOQUE_MAXIMO;
	}
	public Double getESTOQUE() {
		return ESTOQUE;
	}
	public void setESTOQUE(Double eSTOQUE) {
		ESTOQUE = eSTOQUE;
	}
	public Double getQUANTIDADE_AVISO() {
		return QUANTIDADE_AVISO;
	}
	public void setQUANTIDADE_AVISO(Double qUANTIDADE_AVISO) {
		QUANTIDADE_AVISO = qUANTIDADE_AVISO;
	}
	public Double getVALOR_MEDIO() {
		return VALOR_MEDIO;
	}
	public void setVALOR_MEDIO(Double vALOR_MEDIO) {
		VALOR_MEDIO = vALOR_MEDIO;
	}
	public Double getESTOQUE_SEGURANCA() {
		return ESTOQUE_SEGURANCA;
	}
	public void setESTOQUE_SEGURANCA(Double eSTOQUE_SEGURANCA) {
		ESTOQUE_SEGURANCA = eSTOQUE_SEGURANCA;
	}
	public Double getDEMANDA_MEDIA_DIARIA() {
		return DEMANDA_MEDIA_DIARIA;
	}
	public void setDEMANDA_MEDIA_DIARIA(Double dEMANDA_MEDIA_DIARIA) {
		DEMANDA_MEDIA_DIARIA = dEMANDA_MEDIA_DIARIA;
	}
	public Date getDATA_CRIACAO() {
		return DATA_CRIACAO;
	}
	public void setDATA_CRIACAO(Date dATA_CRIACAO) {
		DATA_CRIACAO = dATA_CRIACAO;
	}
	public Date getDATA_ALTERACAO() {
		return DATA_ALTERACAO;
	}
	public void setDATA_ALTERACAO(Date dATA_ALTERACAO) {
		DATA_ALTERACAO = dATA_ALTERACAO;
	}
	@Override
	public String toString() {
		return "MATERIAIS [CODIGO=" + CODIGO + ", DESCRICAO=" + DESCRICAO + ", UNIDADE=" + UNIDADE + ", CODMATCOBRANCA="
				+ CODMATCOBRANCA + ", COD_AHCRJ=" + COD_AHCRJ + ", COD_BRASINDICE=" + COD_BRASINDICE + ", COD_SIMPRO="
				+ COD_SIMPRO + ", USUARIO_CRICAO=" + USUARIO_CRICAO + ", USUARIO_ALTERACAO=" + USUARIO_ALTERACAO
				+ ", EMPRESA=" + EMPRESA + ", CODSUBGRUPO=" + CODSUBGRUPO + ", REGISTRO_ANVISA=" + REGISTRO_ANVISA
				+ ", REFERENCIA_FABRICANTE=" + REFERENCIA_FABRICANTE + ", AUT_FUNCIONAMENTO=" + AUT_FUNCIONAMENTO
				+ ", TIPO=" + TIPO + ", EXCLUIDO=" + EXCLUIDO + ", AVISO_ESTOQUE_MINIMO=" + AVISO_ESTOQUE_MINIMO
				+ ", STATUS=" + STATUS + ", HABILITADO=" + HABILITADO + ", CLASSIFICACAO=" + CLASSIFICACAO
				+ ", CODIGO_MATERIAL=" + CODIGO_MATERIAL + ", CODIGO_BARRA=" + CODIGO_BARRA + ", ID_UNIDADE="
				+ ID_UNIDADE + ", ID_SUBGRUPO=" + ID_SUBGRUPO + ", ID_PRINCIPIO_ATIVO=" + ID_PRINCIPIO_ATIVO
				+ ", ID_ARMAZENAMENTO=" + ID_ARMAZENAMENTO + ", TEMPO_MEDIO_RESSUPRIMENTO=" + TEMPO_MEDIO_RESSUPRIMENTO
				+ ", PRECO=" + PRECO + ", PRECO_COMPRA=" + PRECO_COMPRA + ", ESTOQUE_MINIMO=" + ESTOQUE_MINIMO
				+ ", ESTOQUE_MAXIMO=" + ESTOQUE_MAXIMO + ", ESTOQUE=" + ESTOQUE + ", QUANTIDADE_AVISO="
				+ QUANTIDADE_AVISO + ", VALOR_MEDIO=" + VALOR_MEDIO + ", ESTOQUE_SEGURANCA=" + ESTOQUE_SEGURANCA
				+ ", DEMANDA_MEDIA_DIARIA=" + DEMANDA_MEDIA_DIARIA + ", DATA_CRIACAO=" + DATA_CRIACAO
				+ ", DATA_ALTERACAO=" + DATA_ALTERACAO + "]";
	}
	
}
