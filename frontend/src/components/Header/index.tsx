import "./styles.css";
import logo from "../../assets/img/logo.svg";

function Header() {
  return (
    <header>
      <div className="dsmeta-header-container">
        <div className="dsmeta-logo-container">
          <img src={logo} alt="DSMeta" />
          <h1>DSMeta</h1>
        </div>
        <h1 className="dsmeta-header-tittle">
          Total de vendas por colaborador no período
        </h1>
      </div>
    </header>
  );
}

export default Header;
