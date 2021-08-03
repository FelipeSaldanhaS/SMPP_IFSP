-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 03-Ago-2021 às 23:59
-- Versão do servidor: 10.4.18-MariaDB
-- versão do PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `pizzaria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cardapio`
--

CREATE TABLE `cardapio` (
  `idsabor` int(11) NOT NULL,
  `preco` decimal(10,2) NOT NULL,
  `sabor` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cardapio`
--

INSERT INTO `cardapio` (`idsabor`, `preco`, `sabor`) VALUES
(1, '20.26', 'Atum'),
(2, '23.00', 'Calabresa'),
(4, '25.23', 'Portuguesa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `entregador_func`
--

CREATE TABLE `entregador_func` (
  `id_entregador` int(11) NOT NULL,
  `veiculo` varchar(120) NOT NULL,
  `placa` varchar(8) NOT NULL,
  `id_pedido_atual` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `entregador_func`
--

INSERT INTO `entregador_func` (`id_entregador`, `veiculo`, `placa`, `id_pedido_atual`) VALUES
(4, 'Pop 110i', 'ABC-1234', 3),
(11, 'Pop 130i', 'ABC-1234', 5),
(23, 'Pop 150i', 'ABC-1234', 9);

-- --------------------------------------------------------

--
-- Estrutura da tabela `loginfuncionario`
--

CREATE TABLE `loginfuncionario` (
  `senha` varchar(100) DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  `cpf` varchar(11) NOT NULL,
  `idfunc` int(11) NOT NULL,
  `nome` varchar(80) DEFAULT NULL,
  `endereco` varchar(60) DEFAULT NULL,
  `telefone` varchar(11) DEFAULT NULL,
  `email` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `loginfuncionario`
--

INSERT INTO `loginfuncionario` (`senha`, `tipo`, `cpf`, `idfunc`, `nome`, `endereco`, `telefone`, `email`) VALUES
('202cb962ac59075b964b07152d234b70', 1, '12345678901', 1, 'Felipe Saldanha', 'Rua Opa, N 1', '11987654321', 'Felipe@email.com'),
('250cf8b51c773f3f8dc8b4be867a9a02', 3, '39452139610', 4, 'Carlos', 'Rua Almedia, n 3', '11986190404', 'Carlos@email.com'),
('d41d8cd98f00b204e9800998ecf8427e', 2, '12345678905', 5, 'Jalmir', 'Rua Opa, N 6', '11987654321', 'Jalmir@email.com'),
('d41d8cd98f00b204e9800998ecf8427e', 1, '12345678901', 9, 'Gerente', 'Rua do Gerente, N 230', '11987654321', 'Gerente@email.com'),
('d41d8cd98f00b204e9800998ecf8427e', 2, '12345678901', 10, 'Atendente', 'Rua do Atendente, N 230', '11987654321', 'Atendente@email.com'),
('d41d8cd98f00b204e9800998ecf8427e', 3, '12345678904', 11, 'Entregador', 'Rua do Entrgador, N 234', '11987654321', 'Entregador@email.com'),
('d41d8cd98f00b204e9800998ecf8427e', 3, '12345678904', 23, 'Entregador XX', 'Rua do Entrgador, N 230', '11987654321', 'Entregador@email.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedidos`
--

CREATE TABLE `pedidos` (
  `idpedido` int(11) NOT NULL,
  `id_sabor` int(11) NOT NULL,
  `id_func` int(11) NOT NULL,
  `preco` double NOT NULL,
  `observacao` varchar(100) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `nome_cliente` varchar(100) NOT NULL,
  `hora_inicial` datetime NOT NULL DEFAULT current_timestamp(),
  `hora_final` datetime NOT NULL,
  `nota_fiscal` varchar(50) NOT NULL,
  `statusped` varchar(50) NOT NULL,
  `placa` varchar(8) NOT NULL,
  `endereco` varchar(120) NOT NULL,
  `quantidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pedidos`
--

INSERT INTO `pedidos` (`idpedido`, `id_sabor`, `id_func`, `preco`, `observacao`, `telefone`, `nome_cliente`, `hora_inicial`, `hora_final`, `nota_fiscal`, `statusped`, `placa`, `endereco`, `quantidade`) VALUES
(3, 1, 4, 20.4, 'Borda recheada', '11987654321', 'Jorge', '2021-07-11 14:20:35', '2021-07-11 19:50:23', '1111111111111111111111111', 'Entregue', 'ABC-1234', 'Rua Olá, N 347', 1),
(5, 4, 11, 50.46, 'Borda recheada', '11987654321', 'Carlos Mont', '2021-07-11 14:22:35', '2021-07-11 14:27:39', '1111111111111111111111111', 'Entregue', 'ABC-1234', 'Rua Olá, N 322', 2),
(9, 1, 23, 20.4, 'Borda recheada', '11987654321', 'Sheyla', '2021-07-11 14:20:35', '2021-07-11 17:20:37', '1111111111111111111111111', 'Entregue', 'ABC-1234', 'Rua Olá, N 321', 1),
(12, 1, 4, 20.4, 'Borda recheada', '11987654321', 'Jorge', '2021-07-11 14:20:35', '2021-07-11 19:50:23', '1111111111111111111111111', 'Entregue', 'ABC-1234', 'Rua Olá, N 344', 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cardapio`
--
ALTER TABLE `cardapio`
  ADD PRIMARY KEY (`idsabor`) USING BTREE;

--
-- Índices para tabela `entregador_func`
--
ALTER TABLE `entregador_func`
  ADD PRIMARY KEY (`id_entregador`),
  ADD KEY `entregador_idpedido_pedidos` (`id_pedido_atual`);

--
-- Índices para tabela `loginfuncionario`
--
ALTER TABLE `loginfuncionario`
  ADD PRIMARY KEY (`idfunc`);

--
-- Índices para tabela `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`idpedido`),
  ADD KEY `idsabor` (`id_sabor`),
  ADD KEY `id_func` (`id_func`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cardapio`
--
ALTER TABLE `cardapio`
  MODIFY `idsabor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `loginfuncionario`
--
ALTER TABLE `loginfuncionario`
  MODIFY `idfunc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de tabela `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `idpedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `entregador_func`
--
ALTER TABLE `entregador_func`
  ADD CONSTRAINT `entregador_idpedido_pedidos` FOREIGN KEY (`id_pedido_atual`) REFERENCES `pedidos` (`idpedido`),
  ADD CONSTRAINT `idfunc` FOREIGN KEY (`id_entregador`) REFERENCES `loginfuncionario` (`idfunc`);

--
-- Limitadores para a tabela `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `id_func` FOREIGN KEY (`id_func`) REFERENCES `entregador_func` (`id_entregador`),
  ADD CONSTRAINT `idsabor` FOREIGN KEY (`id_sabor`) REFERENCES `cardapio` (`idsabor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
