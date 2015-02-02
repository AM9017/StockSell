-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Φιλοξενητής: 127.0.0.1
-- Χρόνος δημιουργίας: 02 Φεβ 2015 στις 00:13:18
-- Έκδοση διακομιστή: 5.6.21
-- Έκδοση PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Βάση δεδομένων: `stocksell`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `katigoria` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `eidos` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `etos` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `p_timi` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `k_timi` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `xrwma` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `noumero` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `fulo` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `montelo` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `more` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `stoixeia` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `kwdikos` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `usernm` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Άδειασμα δεδομένων του πίνακα `category`
--

INSERT INTO `category` (`katigoria`, `eidos`, `etos`, `p_timi`, `k_timi`, `xrwma`, `noumero`, `fulo`, `montelo`, `more`, `stoixeia`, `kwdikos`, `usernm`) VALUES
('papoutsia', 'Mpotakia', '2013', '89Eurw', '30Eurw', 'Mauro', '39', 'Gunaikeia', 'Rieker', 'Thl:6989234566', 'popi@gmail.com', '1', 'popi'),
('papoutsia', 'athlitika papoutsia', '2013', '200Eurw', '60Eurw', 'Kokkino', '42', 'Antriko', 'Nike', 'Thl:6989234566', 'popi@gmail.com', '2', 'popi'),
('rouxa', 'Mplouza', '2011', '100Eurw', '15Eurw', 'Aspro', 'Large', 'Gunaikeia', 'Replay', 'Thl:6989234567', 'ana@gmail.com', '3', 'ana'),
('rouxa', 'panteloni', '2014', '120Eurw', '40Eurw', 'Kafe', 'XLarge', 'Antriko', '', 'Thl:6989234567', 'ana@gmail.com', '5', 'ana'),
('accessories', 'roloi', '2010', '300Eurw', '80Eurw', 'Mauro', '', 'Antriko', 'Festina', 'Thl:6989234569', 'sakis@gmail.com', '4', 'sakis'),
('texnologia', 'kinito', '2013', '200Eurw', '70Eurw', 'Aspro', '', '', 'Samsung Y', 'Thl:6989234568', 'dim@gmail.com', '12', 'dim'),
('texnologia', 'usb', '2013', '30Eurw', '8Eurw', 'Roz', '', '', 'ADATA 16GB', 'Thl:6989234568', 'dim@gmail.com', '15', 'dim'),
('accessories', 'tsanta', '2013', '200Eurw', '60Eurw', 'Mpordo', '', 'Gunaikeia', 'Kem', 'Thl:6989234569', 'sakis@gmail.com', '20', 'sakis');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `eggrafi`
--

CREATE TABLE IF NOT EXISTS `eggrafi` (
  `Name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Surname` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Άδειασμα δεδομένων του πίνακα `eggrafi`
--

INSERT INTO `eggrafi` (`Name`, `Surname`, `Email`, `Username`, `Password`) VALUES
('popi', 'papa', 'pop@hotmail.com', 'popi', 'popi'),
('anastasia', 'papa', 'ana@gmail.com', 'ana', 'ana'),
('dim', 'megas', 'dim@gmail.com', 'dim', 'dim'),
('sakis', 'gagas', 'sakis@gmail.com', 'sakis', 'sakis');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
