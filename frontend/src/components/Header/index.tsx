import "./styles.css";
import logo from "../../assets/img/logo.svg";

function Header() {
  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={logo} alt="DSMeta" />
        <h1>DSMeta</h1>
      </div>
    </header>
  );
}

export default Header;
