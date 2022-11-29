import ReactPaginate from "react-paginate";
import arrowIcon from "../../assets/img/arrow.svg";
import './styles.css';

type Props = {
    pageCount: number;
    range: number;
    onChange: (pageNumber: number) => void;
}

const Pagination = ( { pageCount, range, onChange } : Props ) => {
    return (
        <ReactPaginate
           pageCount={pageCount}
           pageRangeDisplayed={range}
           marginPagesDisplayed={1}
           containerClassName='pagination-container'
           pageLinkClassName='pagination-item'
           breakClassName='pagination-item'
           previousClassName='arrow-previous'
           nextClassName='arrow-next'
           activeLinkClassName='pagination-link-active'
           disabledClassName='arrow-inactive'
           onPageChange={(items) => onChange(items.selected)}
           previousLabel={<div className='pagination-arrow-container'><img src={arrowIcon} /></div>}
           nextLabel={<div className='pagination-arrow-container'><img src={arrowIcon} /></div>}
        />
    );
}

export default Pagination;