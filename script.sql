CREATE TABLE `tb_cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `cpf` varchar(11) NOT NULL UNIQUE,
  `cidade` varchar(255) NOT NULL,
  `uf` varchar(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `tb_apolice` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `numero` bigint(100) NOT NULL UNIQUE,
  `dt_inicio_vigencia` DATETIME NOT NULL,
  `dt_fim_vigencia` DATETIME NOT NULL,
  `placa_veiculo` varchar(10) NOT NULL,
  `valor_apolice` decimal(10, 4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `tb_cliente_apolice` (
  `id` bigint(20) NOT NULL,
  `id_cliente` bigint(20) NOT NULL,
  `id_apolice` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_ID_CLIENTE` FOREIGN KEY (`id_cliente`) REFERENCES `tb_cliente` (`id`),
  CONSTRAINT `FK_ID_APOLICE` FOREIGN KEY (`id_apolice`) REFERENCES `tb_apolice` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


