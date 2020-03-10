--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.0
-- Dumped by pg_dump version 9.3.0
-- Started on 2020-03-11 01:33:12

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 172 (class 3079 OID 11750)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1943 (class 0 OID 0)
-- Dependencies: 172
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 171 (class 1259 OID 16517)
-- Name: actor; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE actor (
    actor_id integer NOT NULL,
    lastname character varying(45) NOT NULL,
    firstname character varying(45) NOT NULL
);


ALTER TABLE public.actor OWNER TO postgres;

--
-- TOC entry 170 (class 1259 OID 16512)
-- Name: users; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE users (
    mname character varying(45) NOT NULL,
    email character varying(45) NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;

--
-- TOC entry 1935 (class 0 OID 16517)
-- Dependencies: 171
-- Data for Name: actor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY actor (actor_id, lastname, firstname) FROM stdin;
1	shah	krunal
2	shah	rahul
\.


--
-- TOC entry 1934 (class 0 OID 16512)
-- Dependencies: 170
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY users (mname, email) FROM stdin;
huyuy	fhfghg@ftgfg.com
test	test@test.com
hgugu	gfghf@gfhg.com
tezst	gfghf@dfgfg.com
sdfgsdf	dsfsdf@sfg.vom
test	test@test.com
test	test@test.com
test	test@tweat.com
test	test@tet.vom
test	test@test.com
stest	test@test.com
sdf	dfssdfg@sadf.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test@test.com
test	test2T@SD.COM
test	test@test.com
test	test@rtw3ta
test	etst@twet.com
test	etst@test.com
test	test@test.com
test	test@test.com
testt	test@sdfsdf
test	test@aasd.com
test	test@rtet.com
test	test@test.com
test	test@sad.co
test	test@test.com
tetst	test@gs
krunal	test@test.com
ttest	test@gdds
test	test@twest.com
krunal	test@fgsg.com
krunal	test@krunal.com
\.


--
-- TOC entry 1826 (class 2606 OID 16521)
-- Name: actor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY actor
    ADD CONSTRAINT actor_pkey PRIMARY KEY (actor_id);


--
-- TOC entry 1942 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2020-03-11 01:33:14

--
-- PostgreSQL database dump complete
--

